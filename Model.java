

interface Model{
    public void saveStrings(String[] s);
    public void saveInts(int[] i);
    public void saveBool(boolean[] b);
    public void saveList(Model[] m);
    public String[] getStrings();
    public int[] getInts();
    public boolean[] getBool();
    public Model[] getList();
}