package org.dna.mqtt.moquette.server;

import io.netty.channel.Channel;
/**
 *
 * @author andrea
 */
public interface ServerChannel {
    
    Object getAttribute(Object key);
    
    void setAttribute(Object key, Object value);
    
    void setIdleTime(int idleTime);

    Channel getSocketChannel();
    
    void close(boolean immediately);
    
    void write(Object value);
}
