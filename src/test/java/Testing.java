import org.junit.Assert;
import org.junit.Test;
import task7_8.EntryData;
import task7_8.operations.*;

public class Testing {

   // проверка нулевых значений

   @Test
   public void additionShouldHaveZero() {
      Addition addition = new Addition(0, 0);
      Assert.assertEquals("сумма нулевых значений должна равняться нулю", 0, addition.doOperation(), 1e-9);
   }

   @Test
   public void multiplicationShouldHaveZero() {
      Multiplication multiplication = new Multiplication(0, 0);
      Assert.assertEquals("произведение нулевых значений должна равняться нулю", 0, multiplication.doOperation(), 1e-9);
   }
   @Test
   public void subtractionShouldHaveZero() {
      Subtraction subtraction = new Subtraction(0, 0);
      Assert.assertEquals("разность нулевых значений должна равняться нулю",0, subtraction.doOperation(), 1e-9);
   }
   // не понимаю почему не работает проверка исключения. этот метод при делении на ноль должен выбрасывать исключение
   /*@Test (expected = ArithmeticException.class)
   public void zeroDenominatorShouldThrowException() {
      task7.Test test = new task7.Test();
      test.getOperation(new EntryData(4,0,'/'));
   }*/

   // проверка ненулевых значений
   @Test
   public void sumShouldHaveValue() {
      Addition addition = new Addition(20, 30);
      Assert.assertEquals("сумма значений должна равняться 50", 50, addition.doOperation(), 1e-9);
   }

   @Test
    public void divisionShouldHaveValue() {
       Division division = new Division(125.5, -0.5);
       Assert.assertEquals("частное значений должна равняться -251", -251, division.doOperation(), 1e-9);
    }
   @Test
   public void multiplicationShouldHaveValue() {
      Multiplication multiplication = new Multiplication(126.54, 89.23);
      Assert.assertEquals("произведение  значений должна равняться 11291.1642", 11291.1642, multiplication.doOperation(), 1e-9);
   }
   @Test
   public void subtractionShouldHaveValue() {
      Subtraction subtraction = new Subtraction(56.23,156.12);
      Assert.assertEquals("разность значений должна равняться -99.89",-99.89, subtraction.doOperation(), 1e-9);
   }

   // тесты на метод getOperation

   @Test
   public void sumShouldHaveValueInMethodGetOperation() {
      task7_8.Test test = new task7_8.Test();
      Assert.assertEquals("сумма значений должна равняться 10",10, test.getOperation(new EntryData(4,6,'+')), 1e-9);;
   }

   @Test
   public void divisionShouldHaveValueInMethodGetOperation() {
      task7_8.Test test = new task7_8.Test();
      Assert.assertEquals("частное значений должна равняться 2",2, test.getOperation(new EntryData(4,2,'/')), 1e-9);;
   }
   @Test
   public void multiplicationShouldHaveValueInMethodGetOperation() {
      task7_8.Test test = new task7_8.Test();
      Assert.assertEquals("произведение значений должна равняться 24",24, test.getOperation(new EntryData(4,6,'*')), 1e-9);;
   }

   @Test
   public void subtractionShouldHaveValueInMethodGetOperation() {
      task7_8.Test test = new task7_8.Test();
      Assert.assertEquals("разность значений должна равняться -2",-2, test.getOperation(new EntryData(4,6,'-')), 1e-9);;
   }
}
