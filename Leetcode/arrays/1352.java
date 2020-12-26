class ProductOfNumbers {
    List<Integer> l ;
    int p;
    

    public ProductOfNumbers() {
        l=new ArrayList<>();
        p=1;
    }
    
    public void add(int num) {
        if(num==0)
        {
            l=new ArrayList<>();
            p=1;
            return ;
        }
        p=p*num;
        l.add(p);
    }
    
    public int getProduct(int k) {
        if(k>l.size())return 0;
        if(l.size()==k)
            return l.get(l.size()-1);

        return l.get(l.size()-1)/(l.get(l.size()-1-k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */