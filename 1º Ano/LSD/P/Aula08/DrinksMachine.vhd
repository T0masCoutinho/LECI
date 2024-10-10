library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity DrinksMachine is
    port(CLOCK_50 : in  std_logic;
          SW       : in  std_logic_vector(1 downto 0);
            KEY        : in std_logic_vector(0 downto 0);
            LEDG     : out std_logic_vector(0 downto 0));
end DrinksMachine;

architecture shell of DrinksMachine is
	signal modifiedClock : std_logic;
	signal s_reset : std_logic;
	signal s_V : std_logic;
	signal s_C : std_logic;

    begin
        drinks : work.DrinksFSM(behavioral)
                    port map( clk => CLOCK_50,
                                reset => s_reset,
                                V => s_V,
                                C => s_C,
                                Drink => LEDG(0));
										  
		  divider : work.ClkDivider(Behavioral)
						port map( clkIn => CLOCK_50,
									 clkOut => modifiedClock,
									 divFactor : positive := 2);
									 
			flipFlop1 : work.FlipFlopD(Behavioral)
							port map(clk => CLOCK_50,
end shell;