library IEEE;
use IEEE.std_LOGIC_1164.all;
use IEEE.NUMERIC_std.all;

entity CntUp is
	port(clk 	: in std_logic;
		  reset  : in std_logic;
		  enable : in std_logic;
		  cntVal : out std_logic_vector(29 downto 0));
	end CntUp;
	
architecture Behavioral of CntUp is
	signal s_cntVal : unsigned(29 downto 0);
	
begin 
	process(clk)
	begin 
		if(rising_edge(clk)) then
			if(reset = '1') then
				s_cntVal <= (others => '0');
			elsif(enable = '1') then
				s_cntVal <= s_cntVal + 1;
			end if;
		end if;
	end process;
	
	cntVal <= std_logic_vector(s_cntVal);
end Behavioral;