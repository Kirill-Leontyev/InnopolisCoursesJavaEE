package edu.innopolis.homework1;

import java.util.ArrayList;
import java.util.List;

public class TV {
    List<Channel> channels;
    String modelName;

    TV(String modelName) {
        this.modelName = modelName;
        channels = new ArrayList<>();
    }

    public String getModelName() {
        return modelName;
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public Channel getChannel(int channelNum) {
        return channels.get(channelNum - 1);
    }

}

