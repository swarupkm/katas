public class DbSession {

    private static DbSession dbSession;

    private DbSession (){}

    public static DbSession getDbSession() {
       if (dbSession == null ) {
           dbSession = new DbSession();
       }

       return dbSession;

    }
}
