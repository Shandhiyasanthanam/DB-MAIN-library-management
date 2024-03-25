public class libpass {
    private static final String LIB_USERNAME = "library";
        private static final String LIB_PASSWORD = "lib12";
    
        
        public static boolean authenticate(String name, String password) {
            
            return LIB_USERNAME.equals(name) && LIB_PASSWORD.equals(password);
        }
    
}
