package com.example.model;

import com.example.model.graphql.AgentProjection;
import com.example.model.graphql.Metric;
import com.example.model.graphql.Pbx;
import com.example.model.graphql.QueueProjection;
import com.example.model.graphql.QueueProjectionResolver;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DemoQueryResolver implements com.example.model.graphql.QueryResolver, QueueProjectionResolver {

    @Override
    public Pbx report(String pbxId) throws Exception {
        return new Pbx("1",new ArrayList<>());
    }

    @Override
    public List<Metric> metrics(QueueProjection queueProjection, List<String> metricNames) throws Exception {
        return null;
    }

    @Override
    public List<AgentProjection> agentActivities(QueueProjection queueProjection, List<String> agentExtensions) throws Exception {
        return null;
    }
}
