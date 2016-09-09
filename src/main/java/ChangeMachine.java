public class ChangeMachine {
  private int mQuarters;
  private int mDimes;
  private int mNickels;
  private int mPennies;

  public ChangeMachine() {
    mQuarters = 20;
    mDimes = 20;
    mNickels = 20;
    mPennies = 20;
  }

  public int getQuarters(){
    return mQuarters;
  }

  public int getDimes(){
    return mDimes;
  }

  public int getNickels(){
    return mNickels;
  }

  public int getPennies(){
    return mPennies;
  }

  public int makeQuarterChange(Float totalCash){
    int quarterChangeQuantity = 0;
    while (totalCash > 0.25f && mQuarters > 0){
      totalCash -= 0.25f;
      quarterChangeQuantity += 1;
      mQuarters -= 1;
    }
    return quarterChangeQuantity;
  }

  public int makeDimeChange(Float totalCash){
    int dimeChangeQuantity = 0;
    while (totalCash > 0.10f && mDimes > 0){
      totalCash -= 0.10f;
      dimeChangeQuantity += 1;
      mDimes -= 1;
    }
    return dimeChangeQuantity;
  }

}
