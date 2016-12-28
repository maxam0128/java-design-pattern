package com.maxam.observer.event;

import java.util.EventObject;

/**
 * Created by maxam0128 on 2016/12/28.
 * 产生事件的对象
 * 提供事件发生的信息给事件处理者
 */
public class EventSource extends EventObject{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventSource(Object source) {
        super(source);
    }
}
