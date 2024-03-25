public class userpass {
    private static final String USER_USERNAME = "user";
        private static final String PASSWORD = "user123";
    
        
        public static boolean authenticate(String name, String password) {
            
            return USER_USERNAME.equals(name) && PASSWORD.equals(password);
        }
}
