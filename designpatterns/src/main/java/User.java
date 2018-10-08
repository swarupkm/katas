public class User {
    private String name;
    private String gender;

    private User(){}

    public String getGender() {
        return gender;
    }

    public static class Builder {
        private String name;
        private String gender;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            User user = new User();
            user.name = this.name;
            user.gender = this.gender;
            return user;
        }
    }
}
