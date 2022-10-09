public class SqlServerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Sql server eklendi");
    }
}
