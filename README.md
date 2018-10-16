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
####使用Queue总结
*  `LinkedBlockingQueue`和`ArrayBlockingQueue`使用的比较广泛，同时还有`LinkedBlockingDeque`和`ArrayBlockingDeque`.区别在于前面
两者是先进显出单向，后面两者是双向的：两端都可以进出。注意add、offer、put、remove、poll、take、peek等用法的区别。
   1. 插入方法：
   add(E e) : 添加成功返回true，失败抛IllegalStateException异常  
   offer(E e) : 成功返回 true，如果此队列已满，则返回 false。  
   put(E e) :将元素插入此队列的尾部，如果该队列已满，则一直阻塞
   2. 删除方法:  
   remove(Object o) :移除指定元素,成功返回true，失败返回false  
   poll() : 获取并移除此队列的头元素，若队列为空，则返回 null  
   take()：获取并移除此队列头元素，若没有元素则一直阻塞。
   3. 检查方法  
   element() ：获取但不移除此队列的头元素，没有元素则抛异常  
   peek() :获取但不移除此队列的头；若队列为空，则返回 null。
