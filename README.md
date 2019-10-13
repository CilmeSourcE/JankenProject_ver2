# JankenProject

## 概要
コンソール上で、二人のプレイヤーが三回のじゃんけん勝負を行い、  
勝った回数が多いプレイヤーが勝利するというプログラムです。
  
## 実行方法
JankenMain.javaを実行することで、ジャンケン勝負が開始されます。
  
## 各設定変更方法
#### プレイヤーの名前の変更
Playerクラス生成時のコンストラクタの引数を設定したい名前にして下さい。  
  
  
#### ジャンケンの手の出し方
手の出し方は、Tacticsインターフェースを実装した戦略クラスをプレイヤーに渡すことで設定されています。  
(デフォルトではプレイヤー1はグーのみを出す戦略を、プレイヤー2にランダムに手を出す戦略を設定。)  
  
独自のジャンケンの出し方をさせたい場合は戦略クラスを新たに作成し、  
設定したいプレイヤーにsetTacticsして下さい。
