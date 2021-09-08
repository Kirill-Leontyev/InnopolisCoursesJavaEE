package edu.innopolis.homework1;

import java.util.Random;

public class Controller {
    TV tv;
    Random random = new Random();
    StringBuilder stringBuilder;

    Controller(TV tv) {
        this.tv = tv;
    }

    public void on (int channelNum) {
        try {
            Channel channel = tv.getChannel(channelNum);
            int programCount = channel.programCount();
            int randomProgramNum = random.nextInt(programCount);
            Program program = channel.getProgram(randomProgramNum);
            stringBuilder = new StringBuilder();
            String message = stringBuilder.append("The random TV program from ").append(channel.getName()).append(" is ").append(program.getName()).toString();
            System.out.println(message);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Channel not found");
        }
    }
}
