package com.example.model;

import com.example.model.graphql.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoQueryResolver implements com.example.model.graphql.QueryResolver, QueueProjectionResolver {


    @Override
    public Pbx report(String pbxId) throws Exception {
        if (pbxId.equals("1")) {
            return new Pbx("1");
        } else {
            return null;
        }
    }

    @Override
    public List<AgentActivityProjection> agentActivities(QueueProjection queueProjection, List<String> extensions) throws Exception {
        return null;
    }

    @Override
    public AgentActivityProjectionMetrics agentActivitiesTotals(QueueProjection queueProjection, List<String> extensions) throws Exception {
        return null;
    }
}
