package javaMid8.Exec.p422;

public class OutterA {
    int oa=10;
    static int soa=20;
    void oaM() { }
    static void soaM() { }
    
    void localMethod() {
    	 int ss=40;
    	 
    	 class LocalClass{
    		 final int fa=20;
    		 int ffa=5;
    		 void a() {
    			ffa=ffa+200;
    			oa = oa +100;
    			
    			System.out.println(ffa + " " + oa + " " + (ss + 400) );
    		}
    	 }
    	 LocalClass lc = new LocalClass();
    	 lc.a();
    	 
    	 System.out.println( ss );
    }
    
    
    class InnterA {
    	int ia=20;
    	void iaM() { ia = ia + 10;
    	             soa = soa + 20;
    	             oaM();
    	             soaM();
    	}
    	
    }
    static class InnterSA {
    	int ia=20;
    	void iaM() { ia = ia + 10;
    	             soa = soa + 20;
    	            // oaM(); 
    	             soaM();
    	}
    }
    
}
