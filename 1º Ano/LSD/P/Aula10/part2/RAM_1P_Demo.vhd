library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity RAM_1P_Demo is
    port(CLOCK_50 : in  std_logic;
	      SW       : in  std_logic_vector(12 downto 0);
	      KEY      : in  std_logic_vector(0 downto 0);
	      LEDR     : out std_logic_vector(7 downto 0));
end RAM_1P_Demo;

architecture Structural of RAM_1P_Demo is
    signal key_clean : std_logic;
begin

    debounce : entity work.DebounceUnit(Behavioral)
	            generic map(kHzClkFreq     => 50_000,
						         mSecMinInWidth => 100,
							      inPolarity     => '0',
									outPolarity    => '1')
				   port map(refClk    => CLOCK_50,
						      dirtyIn   => KEY(0),
								pulsedOut => key_clean);

    ram : entity work.RAM_1P_16_8(Behavioral)
	       port map(clk         => key_clean,
			          writeEnable => SW(12),
						 writeData   => SW(11 downto 4),
						 address     => SW(3 downto 0),
						 readData    => LEDR);
						 
end Structural;