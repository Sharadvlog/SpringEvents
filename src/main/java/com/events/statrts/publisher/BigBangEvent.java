package com.events.statrts.publisher;

import org.springframework.context.ApplicationEvent;

public class BigBangEvent extends ApplicationEvent {
    private String episodNo;

    public BigBangEvent(Object source) {
        super(source);
    }

    public String getEpisodNo() {
        return episodNo;
    }

    public BigBangEvent(Object source, String espNo){
        super(source);
        this.episodNo=espNo;
    }
}
