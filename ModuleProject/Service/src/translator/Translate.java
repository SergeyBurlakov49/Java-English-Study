package translator;

@FunctionalInterface
public interface Translate {        // интерфейс службы, требующий реализации через провайдера
    String translate(String str);   // метод, нуждающийся в реализации
}
