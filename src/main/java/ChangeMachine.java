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

}
