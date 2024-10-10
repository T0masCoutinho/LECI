library ieee
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity bin2BCD2 is
port(bin : in std_logic;
	  bin2D : out std_logic_vector(3 downto 0));
	  
architecture Behavioral of bin2BCD is
signal s_bin unsigned(3 downto 0)
process
begin
	
	bin2D <= "1111" when bin = "1" else "0000";
	
end process;
end Behavioral;
	