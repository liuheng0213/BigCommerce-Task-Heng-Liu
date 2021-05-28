package com.BigCommerce;

import com.BigCommerce.task.hengLiu.Application;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    private MockMvc mockMvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    /**
     * unit test total Order number
     * @throws Exception
     */
    @Test
    public void testcustomers() throws Exception {

        String uri = "/bigcommerce/customer/totalOrderNumber";

        MvcResult mvcResult = this.mockMvc
                .perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_FORM_URLENCODED).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print())
                .andReturn();

        String content = mvcResult.getResponse().getContentAsString();
        logger.info("result body: " + content);
    }


    /**
     * unit test a customer's life value
     * @throws Exception
     */
    @Test
    public void testCustomerOrderDetail() throws Exception {

        String uri = "/bigcommerce/customer/orderLifeValue/2";

        MvcResult mvcResult = this.mockMvc
                .perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_FORM_URLENCODED).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print())
                .andReturn();

        String content = mvcResult.getResponse().getContentAsString();
        logger.info("result body: " + content);
    }


    /**
     * unit test if exception happens in the function of a customer's life value
     * in this case, "2SY" is delivered which cannot be transformed to a number
     * @throws Exception
     */
    @Test
    public void testCustomerOrderDetailException() throws Exception {

        String uri = "/bigcommerce/customer/orderLifeValue/2SY";

        MvcResult mvcResult = this.mockMvc
                .perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_FORM_URLENCODED).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print())
                .andReturn();

        String content = mvcResult.getResponse().getContentAsString();
        logger.info("result body: " + content);
    }


}
