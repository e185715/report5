package jp.ac.uryukyu.ie.e185715;

    public class Enemy extends LivingThing {


        /**
         * コンストラクタ。名前、最大HP、攻撃力を指定する。
         *
         * @param name      モンスター名
         * @param maximumHP モンスターのHP
         * @param attack    モンスターの攻撃力
         */
        public Enemy(String name, int maximumHP, int attack) {
//        this.name = name;
//        hitPoint = maximumHP;
//        this.attack = attack;
//        dead = false;
            super(name, maximumHP, attack);
//        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
        }

        /**
         * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
         * @return boolean
         */

        /**
         * 自身へ攻撃されたときのダメージ処理をするメソッド。
         * 指定されたダメージを hitPoint から引き、死亡判定を行う。
         *
         * @param damage 受けたダメージ
         */
        @Override
        public void wounded(int damage) {
            setHitPoint(getHitPoint() - damage);
            if (getHitPoint() <= 0) {
                setDead(true);
                System.out.printf("モンスター%sは倒れた。\n", getName());
            }
        }
    }

