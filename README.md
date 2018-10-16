# 数据结构和算法
####使用Arrays工具类遇到的问题总结
* `Arrays.asList`无法转化基本数据类型的数组  
`int[] a = {1, 2, 3, 4, 5}; Arrays.asList(a);`会转化成一个范型为int[]的集合；
* `Arrays.asList`转换生成的ArrayList调用add等方法遇到的问题：**UnsupportedOperationException**，转化的ArrayList不是java.util.ArrayList,是Arrays内部类的ArrayList，
`private static class ArrayList<E> extends AbstractList<E>
implements RandomAccess, java.io.Serializable
{
    ...
}`
并没有像java.util.ArrayList一样重写了AbstractList的add和addAll等方法。因此调用会AbstractList中的
`public void add(int index, E element) {
    throw new UnsupportedOperationException();
}`抛出异常