package state;

/**
 * 状态类接口
 */
public interface State {
   void doAction(Context context);

   String getState();
}