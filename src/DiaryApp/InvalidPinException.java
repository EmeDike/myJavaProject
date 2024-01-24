package DiaryApp;
    public class InvalidPinException extends Throwable {
        public boolean getMessage;

        public InvalidPinException(String message){
            super(message);
        }
    }
