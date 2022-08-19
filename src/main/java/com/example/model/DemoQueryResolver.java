package com.example.model;

import com.example.model.graphql.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoQueryResolver implements com.example.model.graphql.QueryResolver {
    @Override
    public Pbx report(String pbxId) throws Exception {
        if (pbxId.equals("1")) {
            return new Pbx("1");
        } else {
            return null;
        }
    }
}
