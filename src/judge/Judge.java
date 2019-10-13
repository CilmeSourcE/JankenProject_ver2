package judge;

import player.Player;

/**
 * ジャンケンの審判を表すクラス
 *
 * @author soneoy111
 */
public class Judge {

  /** ジャンケンを行う回数 */
  private static final int JANKEN_BATTLE_CNT = 3;

  /** ジャンケン結果を伝える用の定数(notifyResultメソッド用) */
  private static final boolean NONIFY_WIN = true;

  /**
   * ジャンケンを開始する。
   *
   * @param player1 勝負するプレイヤー1
   * @param player2 勝負するプレイヤー2
   */
  public void startJanken(Player player1, Player player2) {

    // ジャンケンの開始を宣言する
    System.out.println("【ジャンケン開始】\n");

    // プレイヤーの紹介
    System.out.println("プレイヤー1:" + player1.getName());
    System.out.println("プレイヤー2:" + player2.getName() + "\n");

    // ジャンケンを行う
    for (int cnt = 1; cnt <= JANKEN_BATTLE_CNT; cnt++) {

      // 何戦目かを表示する
      System.out.println("【" + cnt + "戦目" + "】");

      // プレイヤーの手を見て、どちらが勝ちかを判定する
      Player winner = judgeJanken(player1, player2);

      if (winner != null) {
        // 勝者を表示する
        System.out.println("\n" + winner.getName() + "が勝利しました！\n");

        // 勝ったプレイヤーへ結果を伝える
        winner.notifyResult(NONIFY_WIN);

      } else {
        // 引き分けの場合
        System.out.println("\n引き分けです！\n");
      }
    }

    // ジャンケンの終了を宣言する
    System.out.println("【ジャンケン終了】\n");

    // 最終的な勝者を判定する
    Player finalWinner = judgeFinalWinner(player1, player2);

    //結果の表示
    System.out.println("結果: " + player1.getWinCount() + " 対 " + player2.getWinCount() + "で、");

    if (finalWinner != null) {
      System.out.println(finalWinner.getName() + "の勝利です！");
    } else {
      System.out.println("引き分けです！");
    }
  }

  /**
   * プレイヤーの出した手から、勝者を戻り値とする
   *
   * @param player1 判定対象プレイヤー1
   * @param player2 判定対象プレイヤー2
   * @return 勝利したプレイヤー。引き分けの場合はnullを返す。
   */
  public Player judgeJanken(Player player1, Player player2) {
    Player winner = null;

    // プレイヤー1の手を出す
    int player1Hand = player1.showHand();

    // プレイヤー2の手を出す
    int player2Hand = player2.showHand();

    // お互いの手を表示する
    printHand(player1Hand);
    System.out.print(" vs ");
    printHand(player2Hand);

    // プレイヤー1が勝利する場合
    if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORS) ||
        (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER) ||
        (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {

      winner = player1;

      // プレイヤー2が勝利する場合
    } else if ((player2Hand == Player.STONE && player1Hand == Player.SCISSORS) ||
        (player2Hand == Player.SCISSORS && player1Hand == Player.PAPER) ||
        (player2Hand == Player.PAPER && player1Hand == Player.STONE)) {

      winner = player2;
    }

    // どちらでもない場合は引き分け(nullを返す)

    return winner;
  }

  /**
   * ジャンケンの手を表示する
   *
   * @param playerHand プレイヤーのジャンケンの手(0:グー, 1:チョキ, 2:パー)
   */
  public void printHand(int playerHand) {
    String jankenHand = "";
    switch (playerHand) {
    case 0:
      jankenHand = "グー";
      break;

    case 1:
      jankenHand = "チョキ";
      break;

    case 2:
      jankenHand = "パー";
      break;
    }

    // ジャンケンの手を表示する
    System.out.print(jankenHand);

  }

  /**
   * お互いの勝った数を比較し、最終的な勝者を決める。
   *
   * @param player1  判定対象プレイヤー1
   * @param player2  判定対象プレイヤー2
   * @return 最終的な勝者。 引き分けの場合はnullを返す。
   */
  public Player judgeFinalWinner(Player player1, Player player2) {
    Player finalWinner = null;

    if (player2.getWinCount() < player1.getWinCount()) {
      // プレイヤー1が勝利した場合
      finalWinner = player1;
    } else if (player1.getWinCount() < player2.getWinCount()) {
      // プレイヤー2が勝利した場合
      finalWinner = player2;
    }
    // どちらでもない場合は引き分け(nullを返す)

    return finalWinner;
  }
}
