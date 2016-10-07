package com.xwood.globel.exception;


/**
 * @author: Donwey
 * 
 * @Desc:
 */

public class BssException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4852040093069759820L;

    public BssException() {
        super();
    }


    public BssException(String message, Throwable cause) {
        super(message, cause);
    }

    public BssException(String message) {
        super(message);
    }

    public BssException(Throwable cause) {
        super(cause);
    }

}
