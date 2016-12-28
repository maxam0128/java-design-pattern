package com.maxam.observer.event;

import java.util.EventListener;
import java.util.EventObject;

/**
 * Created by maxam0128 on 2016/12/28.
 * 事件侦听者,即事件的响应者
 * 这种模式下,事件的响应者也是要注册到产生时间的对象上,以便时间发生时可以通知响应者
 */
public interface IEventListener extends EventListener {

    public void response(EventObject object);

}
