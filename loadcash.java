package customer;

class loadCash extends main{
	   int count_2000=0;
	   int count_500=0;
	   int count_100=0;
	   int total_2000=0;
	   int total_500=0;
	   int total_100=0;
	   int atmbalance=0;
	   
	   public int getTotal_2000() {
		return total_2000;
	}
	public void setTotal_2000(int total_2000) {
		this.total_2000 = total_2000;
	}
	public int getTotal_500() {
		return total_500;
	}
	public void setTotal_500(int total_500) {
		this.total_500 = total_500;
	}
	public int getTotal_100() {
		return total_100;
	}
	public void setTotal_100(int total_100) {
		this.total_100 = total_100;
	}
	public int getAtmbalance() {
		return atmbalance;
	}
	public void setAtmbalance(int atmbalance) {
		this.atmbalance = atmbalance;
	}
	public int getCount_2000() {
		    return count_2000;
	   }
	   public void setCount_2000(int count_2000) {
	        this.count_2000 = count_2000;
	    }
	   public int getCount_500() {
		   return count_500;
	   }
	   public void setCount_500(int count_500) {
		   this.count_500 = count_500;
	    }
	   public int getCount_100() {
		   return count_100;
	    }
	   public void setCount_100(int count_100) {
		   this.count_100 = count_100;
	   }
	   public void upadate_cash(int count_2000, int count_500, int count_100) {
		   this.count_2000+=count_2000;
		   this.count_500+=count_500;
		   this.count_100+=count_100;
		   total_2000=count_2000*2000;
		   total_500=count_500*500;
		   total_100=count_100*100;
	       atmbalance=total_2000+total_500+total_100;	   
	       return;
	   }
	   public boolean update_withdrawl(int amt,int _2000count,int _500count,int _100count) {
		   if(_2000count<=count_2000&&_500count<=count_500&&_100count<=count_100) {
			   count_2000-=_2000count;
			   count_500-=_500count;
			   count_100-=_100count;
			   total_2000-=_2000count*2000;
			   total_500-=_500count*500;
			   total_100-=_100count*100;
		       atmbalance-=amt;
			   return true;
		   }
		   return false;
	   }   
	}
