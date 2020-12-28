package level2.lesson8.server;

import level2.lesson8.database.UserRepository;

public class AuthenticationService {
    private UserRepository users;

    public AuthenticationService() {
        users = new UserRepository();
    }

    public String findNicknameByLoginAndPassword(String login, String password) {
        for (CredentialsEntry entry : users.findAll()) {
            if (entry.getLogin().equals(login) && entry.getPassword().equals(password)) {
                return entry.getNickname();
            }
        }
        return null;
    }

    public static class CredentialsEntry {
        private String login;
        private String password;
        private String nickname;

        public CredentialsEntry(String login, String password, String nickname) {
            this.login = login;
            this.password = password;
            this.nickname = nickname;
        }


        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }

        public String getNickname() {
            return nickname;
        }
    }
}
