package me.vickychijwani.spectre.error;

public final class SyncException extends RuntimeException {

    /**
     * @param throwable - the cause of this exception
     */
    public SyncException(String message, Throwable throwable) {
        super("SYNC EXCEPTION: " + message + ", see previous exception for details", throwable);
    }

}
