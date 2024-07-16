class HelloWorld{
  public static void main(String []args){
  	
	  // Datatypes Examples 
	  int a = 9008;
	  float b=98.7453f;
	  double d=3.1412;
	  boolean isPresent = true;

	  //We will discuss String Class .
	  char c='p';
	  // 'S' in String is capital denoting it's a class.
	  String word = "Hello World !! My name is Aaditya .";

	/* This is a Multi-Line Comment 
	 * .Now we'll make our good old pattern problems. 
	 * Today we will make 
	 * #
	 * ##
	 * ###
	 * ####
	 * #####
	 * just to understand for-loops and while loops .
	 * Later we will learn String Manipulation and make patterns like these:
	 *
	 * H
	 * HE
	 * HER
	 * HERO
	 */
	  int i=0,j=0;
	for(i=0;i<7;i++){
		for(j=0;j<=i;j++){
			System.out.print('#');}
		System.out.print('\n');}
		
	/*int p=2,q=4;
	while (i>0){
		--i;
		System.out.print('\n');
		//Shorthand Operator example
//		p=p+1;
		++p;
		//q=q*3;
		q*=3;
		System.out.println(p);
		System.out.print(q);
		//i=i-1;
	}
*/

	boolean isEven=false;
	boolean isPrime=false;
	int test_num=72;

	// Checking for Even 
	isEven = (test_num%2)==0;
	System.out.print("The Number is Even\n");

	// Checking for Prime 
	// We will divide test_num with all numbers from 1 upto test_num and
	// count the number of factors.
	// if No Of Factors > 2 , then the number isn't prime.
	
	int loop=0,factor_count=0;
	for(loop=1;loop<=test_num;loop++)
	{
	  if((test_num%loop)==0){
		  factor_count++;
		if(factor_count>2){
		isPrime=false;
		break;}
	  }
	  else{
		isPrime=true;
	  }
	}
	/*System.out.print("Prime or not\n");
	System.out.println(isPrime);*/

	if(isPrime){
	System.out.print("The Number "+test_num+" is Prime");
	}
	else{
	System.out.print("The Number "+test_num+" isn't Prime");
}

  }
}
