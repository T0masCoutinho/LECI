library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity SeqDetector is
    port(CLOCK_50 : in  std_logic;
	      SW       : in  std_logic_vector(6 downto 0);
	      LEDG     : out std_logic_vector(0 downto 0);
			LEDR     : out std_logic_vector(2 downto 0);
			HEX0     : out std_logic_vector(6 downto 0);
			HEX1     : out std_logic_vector(6 downto 0);
			HEX2     : out std_logic_vector(6 downto 0);
			HEX3     : out std_logic_vector(6 downto 0);
			HEX4     : out std_logic_vector(6 downto 0);
			HEX5     : out std_logic_vector(6 downto 0));
end SeqDetector;

architecture Structural of SeqDetector is
    signal s_clk   : std_logic;
	 
	 
begin
    clk_divider : entity work.ClkDividerN(Behavioral)
	               generic map(divFactor => 125_000_000)
						port map(clkIn  => CLOCK_50,
						         clkOut => s_clk);
									
	 timerN
									
    fsm : entity work.AirFryerFSM(behavioral)
	      port map(reset => '0',
			         clk => s_clk,
						reset => SW(0),
						

						
						
end Structural;