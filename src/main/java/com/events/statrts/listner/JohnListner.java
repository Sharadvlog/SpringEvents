package com.events.statrts.listner;

import com.events.statrts.publisher.BigBangEvent;
import org.springframework.context.ApplicationListener;

public class JohnListner implements ApplicationListener<BigBangEvent> {
    @Override
    public void onApplicationEvent(BigBangEvent event) {
        System.out.printf("John has started listning to BigBangEvent no {} ", event.getEpisodNo());
    }
}
