public class Trap extends Room
    {

        public Trap(int x, int y) {
            super(x, y);

        }

        /**
         * Triggers the game ending conditions.
         * @param x the Person entering
         */
        @Override
        public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            System.out.println("You have fallen into a trap, your adventure ends here, start over");
            Runner.gameOff();
        }


    }

