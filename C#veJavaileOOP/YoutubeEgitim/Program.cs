using System.Security.Cryptography.X509Certificates;
using System.Text;

internal class Program
{
    private static void Main(string[]args)
    {
        /*int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        Console.WriteLine(sayi1);
        int[] sayilar1 = new[] { 1, 2, 3 };
        int[] sayilar2 = new[] { 10, 20, 30 };
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        Console.WriteLine(sayilar1[0]);

        CreditManager creditManager = new CreditManager(); //örneğini oluşturma, instance creation
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.Id = "1";
        customer.FirstName = "Taha";
        customer.LastName = "Sanay";
        customer.NationalIdenity = "11111111111";
        customer.City = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.Id = "2";
        company.TaxNumber = "325652";
        company.CompanyName = "HarikaCompany";

        CustomerManager customerManager1 = new CustomerManager(new Person());

        Person person = new Person();
        person.Id = "3";
        person.FirstName = "Taha";
        person.NationalIdenity = "11111111111";

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();*/

        //interface iş yapan sınıfların operasyonlarının sadece imza seviyesinde yazarak yazılımda bağımlılığı korumak adına yapılan çalışmadır.
        //refarans tiptir implement edenin referansını tutabilir.

        //sonar gube 

        //spagetti kod 

        //IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();

        Console.ReadLine(); 
        

    }
    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandi");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");    
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();   
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }

    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            //ogretmen kredisine gore hesaplamalar
            Console.WriteLine("Ogretmen kredisi hesaplandi");
        }
            public override void Save()
        {
            //temel sınıftan farklı bir kod çalıştırılabilir
            base.Save();
            //
        }
    }
      class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandi");
        }
    }
    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandi");
        }
    }

    //SOLID principal

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Musteri nesnesi baslatıldı");
        }
        public string Id { get; set; } 
        public string City { get; set; }   
    }

    class Person : Customer
    {
        public string NationalIdenity { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
    }

    class Company : Customer
    {
        public string TaxNumber { get; set; }   
        public string CompanyName { get; set; }
    }

    //Katmanlı mimari

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;

        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer  ;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Musteri kaydedildi" + _customer.Id);
        }
        public void Delete()
        {
            Console.WriteLine("Musteri silindi" + _customer.Id);
        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
}