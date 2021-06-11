
public class TestTree {

    public static void main(String[] args) {
        int level = 4; //колличество уровней
        int count = 20; //колличество деревьев
        int countBalanced = 0; //количество сбалансированных деревьев
        int max = 25; //максимальный диапазон числа для заполнения
        int min = -25; //минимальный диапазон числа для заполнения
        int nodeCount = (int) (Math.pow(2, level) - 1);
        boolean treeView = false;

        for (int i = 0; i < count; i++) {
            Tree tree = new Tree(level);
            initTree(nodeCount, max, min, tree);
            if (tree.isBalanced()) {
                countBalanced++;
                if (!treeView) {
                    treeView = true;
                    tree.printTree();
                }
            }
        }
        System.out.println("Процент сбалансированных деревьев = " + ((countBalanced / (count * 1.0)) * 100) + "%");
    }

    private static void initTree(int nodeCount, int max, int min, Tree tree) {
        for (int i = 0; i < nodeCount; i++) {
            int x = (int) ((Math.random() * ((max - min) + 1)) + min); //получаем рандомное число в заданном промежутке
            tree.add(x); //заполняем
        }
    }
}
