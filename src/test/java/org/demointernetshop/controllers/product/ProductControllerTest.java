package org.demointernetshop.controllers.product;

import org.demointernetshop.dto.product.ProductDto;
import org.demointernetshop.services.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private ProductService productService;

    @Test
    void getProductById() throws Exception {
        int productId = 1;
        when(productService.getProductById(productId)).thenReturn(new ProductDto()); // Replace with your expected return object

        mockMvc.perform(MockMvcRequestBuilders.get("/api/products/{product_id}", productId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").exists()); // Validate the response structure
    }
}