library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity MiniProg24_Demo is
    port(CLOCK_50 : in  std_logic;
	      SW       : in  std_logic_vector(2 downto 0);
			LEDG		: out std_logic_vector(3 downto 0);
			LEDG     : out std_logic_vector(3 downto 0);
			HEX0		: out std_logic_vector(6 downto 0));
end MiniProg24_Demo;

architecture Structural of MiniProg24_Demo is
	signal bin :  std_logic;

begin

	control : entity work.controlador(Behavioral)
				port map(inputs => SW(1 downto 0),
							enable => SW(2),
							outputs => dec);
							
	display : entity work.Bin7SegDecoder(Behavioral)
				port map(binINput => bin,
							enable => SW(2),
							decOut => HEX0(6 downto 0));
							
							
	
							
							
end Structural
	