package DiaryApp;
import java.util.ArrayList;

    public class Diary {
        private String userName;
        private String password;
        private boolean isLocked = true;
        private final ArrayList <Entry>  entries;
        private int totalNumberOfEntry;
        public Diary(String userName, String password) {
            this.password = password;
            this.userName = userName;
            entries = new ArrayList<Entry>();
        }

        public boolean isLocked() {
            return isLocked;
        }

        public void unlockDiary(String password) throws InvalidPinException {
            validatePin(password);
            isLocked = false;
        }

        private void validatePin(String password) throws InvalidPinException {
            if(!this.password.equals(password)) throw new InvalidPinException("incorrect pin");
        }

        public void lockDiary() {
            isLocked = true;
        }

        public void createAnEntry(String title, String body) {
            boolean isUnlocked = !isLocked;
            if(isUnlocked) {
                totalNumberOfEntry++;
                Entry entry = new Entry(totalNumberOfEntry, title, body);
                entries.add(entry);
            }
        }

        public int getTotalNumberOfEntry() {
            return entries.size();
        }

        public void removeAnEntry(int id) {
            Entry entry = findEntryById(id);
            entries.remove(entry);
            totalNumberOfEntry--;
        }

        public void update(int id, String title, String body) {
            Entry entry = findEntryById(id);
            entry.setBody(body);
            entry.setTitle(title);
        }

        public Entry findEntryById(int id){
            for(Entry entry: entries){
                if(entry.getId() == id){
                    return entry;
//                System.out.println(entry);

                }
            }
            return null;
        }
        public void title(){

        }


        public void deleteAnEntry(int id) {
            Entry entry = findEntryById(id);
            entries.remove(entry);
        }

        public String getUserName() {
            return userName;
        }

        public void createDiary(String name, String password) {
        }
    }
