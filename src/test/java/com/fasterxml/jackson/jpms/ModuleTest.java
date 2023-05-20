package com.fasterxml.jackson.jpms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

final class ModuleTest {
     void testModule() throws JsonProcessingException {
        Bean bean = new Bean("id1");
        new ObjectMapper().writeValueAsString(bean);
    }
}