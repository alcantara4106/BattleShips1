You must create 2 + classes.

   Parent class is abstract, defines your affiliation, team, country, etc, and extends ship. This allows
   one team to find all the ships of a specific subclass, so they can track, chase, shoot, etc.
   (See the World method getObjects. You may have to google for syntax)
   
   You can define multiple subclasses of your parent class (destroyer, ptboat, carrier, etc)
   A boat's size must be at least 25 pixels wide and 25 pixels tall, but no more than 100 pixels wide by 
   60 pixels wide.  Each group of boats must be "painted" the same color. A team can have no more than 
   5 active boats at one time. (This may become a variable)
   
   You get a total of 100 bullets at any one time, and a total power of 20 that you can distribute
   as you wish.  (These may become variables) Each time you are hit the boat that is hit looses one power points. If a boat's power
   drops to 0, that ship is destroyed, and looses any bullets in it's possession at the time.  To reload, 
   or repower, it must return to a boomed off area.  To reload, both the ship reloading and the mother
   ship must be in the same boomed area. 
   
   One boat must be the mother ship.  When this ship is within the boundaries of a boom area (defined by
   booms) it can clone additional boats up to a maximum of 5 (or variable, if we implement), in the event
   that some of it's fleet has been destroyed. 
   
   Most ship actions and bullet actions should be defined in the interface for ship or bullet actions.
   We will have to grow this list as we develop this game.
   
   
   
   