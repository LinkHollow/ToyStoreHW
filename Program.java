public class Program {
    public static void main(String[] args) {
        //создаем игрушки
        ToyModel item1 = new ToyModel("Мишка", 2, 20);
        ToyModel item2 = new ToyModel("Кавальский", 3, 10);
        ToyModel item3 = new ToyModel("Итер", 10, 10);
        ToyModel item4 = new ToyModel("Шрек", 5, 5);
        ToyModel item5 = new ToyModel("Маквин", 30, 40);
        ToyModel item6 = new ToyModel("Тимон", 10, 30);
        ToyModel item7 = new ToyModel("Пумба", 10, 70);
        ToyModel item8 = new ToyModel("Симба", 10, 70);
        ToyModel item9 = new ToyModel("Кинг", 1, 2);


        System.out.println("_________________");
        //создаем магазин
        ToyStoreModel store = new ToyStoreModel("Гоп Шоп");
        System.out.println(store.toString());

        //добавляем игрушки в магазин
        store.addItem(item1);
        store.addItem(item2);
        store.addItem(item3);
        store.addItem(item4);
        store.addItem(item5);
        store.addItem(item6);
        store.addItem(item7);
        store.addItem(item8);
        store.addItem(item9);
        //выводим ассортимент
        store.printAllItems();

        //получаем подарки
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        store.chooseItem();
        //выводим подарки, ожидающие выдачи
        store.printAllSelectedItems();
        //выдаем игрушку
        store.giveOutPrize("Симба");
        //выдаем все подарки
        store.giveOutAllPrizes();
        //выводим подарки, ожидающие выдачи
        store.printAllSelectedItems();

    }
}