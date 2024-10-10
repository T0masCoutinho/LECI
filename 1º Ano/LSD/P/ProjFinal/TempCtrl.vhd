library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity TempCtrl is
	port( program : in std_logic_vector(7 downto 0);
			temperature : out std_logic_vector(3 downto 0));
end TempCtrl;
			
architecture Behavioral of TempCtrl is
begin 
	process(program)
		
		begin
			if (program = "00000000") then temperature <= "0000"; --IDLE = 20 grau
			elsif (program = "00000001") then temperature <= "0001"; --Default = 200 grau
			elsif (program = "00000010") then temperature <= "0001"; --Batatas = 200 grau
			elsif (program = "00000011") then temperature <= "0010"; --Filete = 170 grau
			elsif (program = "00000100") then temperature <= "0010"; --Hamburger = 170 grau
			elsif (program = "00000101") then temperature <= "0011"; --Rissois = 180 grau
			else  temperature <= "XXXX"; --Dont care
			end if;
	end process;
end Behavioral;