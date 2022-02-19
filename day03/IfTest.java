/*
分支结构的if-else（条件判断结构）

一、三种结构

第一种：
if(条件表达式){
	执行代码块1;
}

第二种：二选一
if(条件表达式1){
	执行代码块1;
}else{
	执行代码块2;
}

第三种
if(条件表达式1){
	执行代码块1;
}else if (条件表达式2){
	执行代码块2;
}
……
else{
	执行代码块n;
}
*/
class IfTest 
{
	public static void main(String[] args) 
	{
		//举例1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("需要做进一步检查");
		}
		System.out.println("检查结束");

		//举例2
		int age =23;
		if (age < 18){
			System.out.println("你还可以看动画片");
		}else{
			System.out.println("你可以看成人电影了");
		}

		//举例3
		if (age < 0){
			System.out.println("你输入的数据非法");
		}else if(age < 18){
			System.out.println("青少年时期");
		}else if(age < 35){
			System.out.println("青壮年时期");
		}else if(age < 60){
			System.out.println("中年时期");
		}else if(age < 120){
			System.out.println("老年时期");
		}else{
			System.out.println("你要成仙啊~~~");
		}


	}
}
