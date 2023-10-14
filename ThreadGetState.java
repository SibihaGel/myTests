package org.example;

public class ThreadGetState {

    private static final String MASSAGE_TEMPLATE_THREAD_STATE = "%s: %s\n";

    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread = Thread.currentThread();
        final Thread thread = new Thread(() -> {
            try {
                mainThread.join(2000); // Thread-0: TIMED_WAITING для перевода в состояние WAITING меняемм на 1000 = sleep
            } catch (InterruptedException e) {

            }
            showThreadState(Thread.currentThread());
        });

        thread.start();
        Thread.sleep(1000);
        showThreadState(thread);
    }

    public static void showThreadState (final Thread thread) {
        System.out.printf(MASSAGE_TEMPLATE_THREAD_STATE, thread.getName(), thread.getState());

    }
}
