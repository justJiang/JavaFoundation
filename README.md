## JAVA基础知识
### 基本数据类型分类(4类8种) 
* 整数型
	* byte 占一个字节（8位）  -128到127
	* short 占两个字  -2^15~2^15-1
	* int 占四个字节 -2^31~2^31-1
	* long 占八个字节 -2^63~2^63-1
* 浮点型
	* float 占两个字节 -3.403E38~3.403E38
	* double 占四个字节-1.798E308~1.798E308
	* 字符型
	* char 占两个字节 0~65535
* 布尔型
	* boolean   
	* boolean理论上是占八分之一个字节,因为一个开关就可以决定是true和false了,但是java中boolean类型没有明确指定他的大小
## 自动类型提升
* byte,short,char -- int -- long -- float -- double  
## ASCII码表
* '0'  48
* * 'A'  65
* 'a'  97
## 位运算符
* <<:左移	左边最高位丢弃，右边补齐0
* >>:右移	最高位是0，左边补齐0;最高为是1，左边补齐1
* >>>:无符号右移 无论最高位是0还是1，左边补齐0
## LOOP
* switch
	* 无break的穿透效果
	* int及以下类型，枚举,String也在JDK1.7后支持
* continue break
	* continue 跳过本次循环，继续下次循环
	* break 结束循环
	* 
		    public static void main(String[] args) { 
			    for (int i = 0; i < 10; i++) { 
			    	if (i == 3) { 
			    		//break;  // 结束循环 
			    		continue;   // 跳过本次循环，继续下次循环 
			    	} 
			    	System.out.println(i); 
			    } 
		    }
## 方法重载
* 在同一个类中，方法名相同，参数列表不同。与返回值类型无关。

## 面向对象
* this	当前对象的引用
* super	父类对象的引用

### static关键字
* 随着类（字节码文件class）的加载而加载进方法区的*静态区*
* 不能使用this关键字调用
* 被类的所有对象共享
* 可以通过类名调用（工具类的静态方法）
* **静态只能访问静态**

### 代码块
* a:局部代码块 
	* 在方法中出现；限定变量生命周期，及早释放，提高内存利用率
* b:构造代码块 (初始化块)
	* 在类中方法外出现；多个构造方法方法中相同的代码存放到一起，每次**调用构造都执行**，并且在构造方法前执行
* c:静态代码块 
	* 在类中方法外出现，并加上static修饰；用于给类进行初始化，在**加载的时候就执行，并且只执行一次**。
	* 一般用于加载驱动


			public class CodeBlockDemo {
			
			    // 构造代码块
			    {
			        System.out.println("构造代码块");
			    }
			
			    // 静态代码块
			    static {
			        System.out.println("静态代码块");
			    }
			
			    public CodeBlockDemo() {
			        System.out.println("构造方法");
			    }
			}
			
			class CodeBlodeDemoMain {
			    public static void main(String[] args) {
			        CodeBlockDemo codeBlockDemo1 = new CodeBlockDemo();
			        System.out.println("------------------------------");
			        CodeBlockDemo codeBlodeDemo2 = new CodeBlockDemo();
			    }
			}
	
			/*
			输出结果：
	
			静态代码块
			构造代码块
			构造方法
			------------------------------
			构造代码块
			构造方法
			*/

### 继承
	class FuFu {
	    static {
	        System.out.println("静态代码块Fu");
	    }
	
	    {
	        System.out.println("构造代码块Fu");
	    }
	
	    public FuFu() {
	        System.out.println("构造方法Fu");
	    }
	}
	
	class ZiZi extends FuFu {
	    static {
	        System.out.println("静态代码块Zi");
	    }
	
	    {
	        System.out.println("构造代码块Zi");
	    }
	
	    public ZiZi() {
	        System.out.println("构造方法Zi");
	    }
	}
	
	class MainTest {
	    public static void main(String[] args) {
	        ZiZi ziZi = new ZiZi();
	    }
	}
	    /**
		运行结果：
	     静态代码块Fu
	     静态代码块Zi
	     构造代码块Fu
	     构造方法Fu
	     构造代码块Zi
	     构造方法Zi
	     */

### final关键字
* 修饰基本类型    值不能被改变
* 修饰引用类型    地址值不能被改变
	
### 权限修饰符

| 权限修饰符\权限       |  本类     | 同一个包下(子类和无关类) | 不同包下(子类) | 不同包下(无关类) |
| ----------- | :-----: | :------------------: | :-----: | :-----------: |
| private | Y |  |  |  |
| 默认 | Y | Y |  |  |
| protected | Y | Y | Y |  |
| public | Y | Y | Y | Y |

### 匿名内部类
* 内部类的简化写法
* 本质：  **是一个继承了该类或者实现了该接口的子类匿名对象。**

		public void methodForNoNameInnerClass() {
	
	        // 接口的实现并创建匿名对象
	        // 实现了类或接口的子类匿名对象
	        new Inter() {
	            @Override
	            public void method() {
	                System.out.println("NoNameInnerClassMethod Run");
	            }
	        }.method();
	    }

### String类的理解
* String str = new String("abc");实际上创建了两个对象，当“abc”定义时，已经在内存中生成了一个常量
* String类型当作方法参数传递时，其作用类似于基本数据类型。传递的是值。
* StringBuffer和StringBuilder即常见的引用数据类型。

## Java集合框架
![Java集合框架](http://wx3.sinaimg.cn/mw690/7f139c3bgy1fgmtmbkotaj20tt08k74b.jpg)

### 泛型
 * 使用泛型前需先声明
 * 在类、接口和方法上均可声明
 * 在方法上使用泛型


