package org.melody.springbootlearn.exception;

/**
 * @author: melody
 * @date: 2020-10-30
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
